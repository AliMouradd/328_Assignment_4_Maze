# 328_Assignment_4_Maze
 

Programming Assignment 4

In some places, there are large, square n X n
hedge mazes that people like to
walk around in and explore.  The people that construct these mazes want them
to be substantially di erent so that each exploration is as unique an experience
as possible.  There are rules to exploring mazes:
1.  All movements within the maze occur one cell at a time.
2.  All explorations begin at the northwest corner of the maze.
3.  If  you  have  an  option  to  move  in  more  than  one  direction,  then  your
movement preferences will be in the following order:  north, south, west,
and east.  In other words, given the option of moving, you will choose to
move north  rst.  If you can't move north,  you'll try to move south.  If
you can't move south, you'll move west, and so on.  (This will operate as
a DFS.)
It is guaranteed that no maze will ever contain a loop.
The measure of similarity of two mazes is de ned to be the longest number
of  movements  that  appear  in  order  the  same  way  in  the  exploration  of  both
mazes. Note that the movements need not be consecutive. For example, if, when
exploring one maze, you move south, north, east, north, west, and in another
maze,  you  move  north,  north,  east,  south,  west,  then  the  longest  number  of
nonconsecutive movements in common is north, north, west.
Given a set of mazes, your goal is to determine the two mazes that are
least alike.
In other words, which of the pairs of the mazes that you are given has
the smallest longest number of exploration movements in common.
The  mazes  are  numbered  starting  from  0.   On  a  single  line,  output  the
numbers of the two mazes that are the least alike.

Input and output
The input (input.txt) will begin with two integers, each on a separate line.  The
first will be the total number of mazes and the second will be the number n.
The maze will then be written out cell by cell in the following order:  (north-
west)(0,0), (0,1), ..., (0, n-1), (1,0), (1,1), ...  , (1, n-1), ...  , (n-1,0), ..., (n-1,n-
1)(southeast).  4 characters fully describe any particular cell of the maze.  They
will be listed in the following order:  north, south, west, east.  If the character is
1, you should imagine a hedge in that particular direction.  If there is a 0, you
should imagine an open space.

For example, the following is a maze where
n= 4:
1011111010001001
0011101100110111
0010000000001001
0111011101110111
A visualization of this maze is as follows:
The output (output.txt) should be a single line with two integers separated
by a space.  
