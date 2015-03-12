from graphics import *
import random

BLOCK_SIZE = 30
BOARD_WIDTH = 10
BOARD_HEIGHT = 20


class Block(Rectangle):
    OUTLINE_WIDTH = 3

    def __init__(self, pos, color):
        self.x = pos.x
        self.y = pos.y
        
        p1 = Point(pos.x*BLOCK_SIZE + Block.OUTLINE_WIDTH,
                   pos.y*BLOCK_SIZE + Block.OUTLINE_WIDTH)
        p2 = Point(p1.x + BLOCK_SIZE, p1.y + BLOCK_SIZE)

        Rectangle.__init__(self, p1, p2)
        self.setWidth(Block.OUTLINE_WIDTH)
        self.setFill(color)

    def can_move(self, board, dx, dy):
        
        return board.can_move(self.x+dx,self.y+dy)
    
    def move(self, dx, dy):
        
        self.x += dx
        self.y += dy

        Rectangle.move(self, dx*BLOCK_SIZE, dy*BLOCK_SIZE)


class Shape():
    
    def __init__(self, coords, color):
        self.blocks = []
        self.rotation_dir = 1
        self.shift_rotation_dir = False
        
        for pos in coords:
            self.blocks.append(Block(pos, color))



    def get_blocks(self):
        
        return self.blocks

    def draw(self, win):
     
        for block in self.blocks:
            block.draw(win)

    def move(self, dx, dy):
        
        for block in self.blocks:
            block.move(dx, dy)

    def can_move(self, board, dx, dy):
        for block in self.blocks:
            if not block.can_move(board,dx,dy):
                return False
        return True
                    
    def get_rotation_dir(self):
        return self.rotation_dir

    def can_rotate(self, board):
        rot_dir = self.get_rotation_dir()
        center = self.center_block
        self.dx = []
        self.dy = []
        for block in self.blocks:            
            x = block.x - center.x
            y = block.y - center.y
            x2 = - rot_dir * y
            y2 = rot_dir * x
            
            dx = x2-x
            dy = y2-y
            
            self.dx.append(dx)
            self.dy.append(dy)
            if not block.can_move(board,dx,dy):
                return False
        return True
        

    def rotate(self, board):
        rot_dir = self.get_rotation_dir()
        
        center = self.center_block
        k = 0
        for block in self.blocks:
            block.move(self.dx[k], self.dy[k])
            k += 1

        if self.shift_rotation_dir:
            self.rotation_dir *= -1

 
class I_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x - 2, center.y),
                  Point(center.x - 1, center.y),
                  Point(center.x    , center.y),
                  Point(center.x + 1, center.y)]
        Shape.__init__(self, coords, 'blue')
        self.shift_rotation_dir = True
        self.center_block = self.blocks[2]

class J_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x - 1, center.y),
                  Point(center.x    , center.y),
                  Point(center.x + 1, center.y),
                  Point(center.x + 1, center.y + 1)]
        Shape.__init__(self, coords, 'orange')        
        self.center_block = self.blocks[1]

class L_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x - 1, center.y),
                  Point(center.x    , center.y),
                  Point(center.x + 1, center.y),
                  Point(center.x - 1, center.y + 1)]
        Shape.__init__(self, coords, 'cyan')        
        self.center_block = self.blocks[1]


class O_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x    , center.y),
                  Point(center.x - 1, center.y),
                  Point(center.x   , center.y + 1),
                  Point(center.x - 1, center.y + 1)]
        Shape.__init__(self, coords, 'red')
        self.center_block = self.blocks[0]

    def rotate(self, board):
        return 

class S_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x    , center.y),
                  Point(center.x    , center.y + 1),
                  Point(center.x + 1, center.y),
                  Point(center.x - 1, center.y + 1)]
        Shape.__init__(self, coords, 'green')
        self.center_block = self.blocks[0]
        self.shift_rotation_dir = True
        self.rotation_dir = -1


class T_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x - 1, center.y),
                  Point(center.x    , center.y),
                  Point(center.x + 1, center.y),
                  Point(center.x    , center.y + 1)]
        Shape.__init__(self, coords, 'yellow')
        self.center_block = self.blocks[1]


class Z_shape(Shape):
    def __init__(self, center):
        coords = [Point(center.x - 1, center.y),
                  Point(center.x    , center.y), 
                  Point(center.x    , center.y + 1),
                  Point(center.x + 1, center.y + 1)]
        Shape.__init__(self, coords, 'magenta')
        self.center_block = self.blocks[1]
        self.shift_rotation_dir = True
        self.rotation_dir = -1      



class Board():
        
    def __init__(self, win):
        self.canvas = win
        self.canvas.setBackground('light gray')

        self.grid = {}

    def draw_shape(self, shape):
        if shape.can_move(self, 0, 0):
            shape.draw(self.canvas)
            return True
        return False

    def can_move(self, x, y):
        if x in range(BOARD_WIDTH) and \
            y in range(BOARD_HEIGHT) and \
            (x,y) not in self.grid:
                    return True
        return False

    def add_shape(self, shape):
        blocks = shape.get_blocks()
        for block in blocks:
            self.grid[block.x,block.y] = block
        


    def delete_row(self, y):
        for x in range(BOARD_WIDTH):
            block = self.grid[x,y]

            del self.grid[x,y]
            block.undraw()
        
    
    def is_row_complete(self, y):        
        for x in range(BOARD_WIDTH):
            if (x,y) not in self.grid:
                return False
        return True
    
    def move_down_rows(self, y_start):
        for x in range(BOARD_WIDTH):
            for y in reversed(range(y_start+1)):
                if (x,y) in self.grid:
                    block = self.grid[x,y]
                    del self.grid[x,y]
                    block.move(0,1) 
                    self.grid[x,y+1] = block   
                       
        
    
    def remove_complete_rows(self):        
        for y in range(BOARD_HEIGHT):
            if self.is_row_complete(y):  
                self.delete_row(y)
                self.move_down_rows(y-1)

    def game_over(self):        
        oval = Oval(Point(0,1.2*BOARD_HEIGHT/2*BLOCK_SIZE), \
                    Point(BOARD_WIDTH*(BLOCK_SIZE),.8*BOARD_HEIGHT/2*BLOCK_SIZE))
        oval.setFill('white')
        oval.draw(self.canvas)
        
        text = Text(Point(BOARD_WIDTH/2*(BLOCK_SIZE),BOARD_HEIGHT/2*BLOCK_SIZE),'Game Over!!!')
        text.setSize(32)
        text.setStyle('bold')
        text.draw(self.canvas)


SHAPES = [I_shape, J_shape, L_shape, O_shape, S_shape, T_shape, Z_shape]
DIRECTION = {'Left':(-1, 0), 'Right':(1, 0), 'Down':(0, 1)}

class Tetris():
    
    def __init__(self, win):
        self.board = Board(win)
        self.win = win
        self.delay = 1000 

        self.win.bind_all('<Key>', self.key_pressed)

        self.current_shape = self.create_new_shape()
        
        self.board.draw_shape(self.current_shape)

        self.animate_shape()


    def create_new_shape(self):
        n = random.randint(0,6)
        shape = SHAPES[n](Point(round(BOARD_WIDTH/2),0))
        return shape
    
    def animate_shape(self):
        self.do_move('Down')
        self.win.after(self.delay, self.animate_shape)
    
    def do_move(self, direction):                
        (dx,dy) = DIRECTION[direction]  
        if self.current_shape.can_move(self.board,dx,dy):
            self.current_shape.move(dx,dy)
            return True
        else:   
            if direction == 'Down':
                
                self.board.add_shape(self.current_shape)
                
                self.board.remove_complete_rows()
                
                self.current_shape = self.create_new_shape()
                
                ret = self.board.draw_shape(self.current_shape)
                if ret == False:
                    self.game_over()
            return False
            

    def do_rotate(self):
        
        if self.current_shape.can_rotate(self.board) == True:
            self.current_shape.rotate(self.board)

    
    def key_pressed(self, event):
            
        key = event.keysym

        if key in DIRECTION:  
            self.do_move(key)
        elif key == 'space':
            
            dx = 0
            dy = 1
            while self.current_shape.can_move(self.board,dx,dy):   
                self.current_shape.move(dx,dy)  # move down
            self.do_move('Down')    
        elif key == 'Up':
            self.do_rotate()
        #print(key)
       


win = GraphWin("Tetris",BOARD_WIDTH * BLOCK_SIZE,
                        BOARD_HEIGHT * BLOCK_SIZE)
game = Tetris(win)
win.mainloop()
