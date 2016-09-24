# COMP66_51
# COMP 6651: Algorithm Design Techniques
Fall 2016: Programming Assignment 1
Due: October 2, 2016 at midnight
# 1 Problem
Your task is to write a program that can unscramble words.
# 2 Input
The input file contains two parts, separated by ”—–”. The first part is a set of dictionary
words which are on separate lines. In the second part of the file, is a set of jumbled words
which may or may not be anagrams of the dictionary words. We reach the end of file when we
come across ”—–” for the second time. The dictionary words and jumbled words are distinct
and can only contain lowercase letters. Each word’s length varies from 3 to 30 characters.
The words are not sorted alphabetically.
# 3 Output
For each jumbled word in the second part of an input file , output all the possible anagrams
present in the dictionary. Each possible anagram should be on a new line. If there is no
anagram for a particular jumbled word you should mention ”No Answer Found”. After every
set of anagrams for a particular jumbled word, print a line containing nineteen ”-” characters
as a separator.
# 4 Example
Sample Input
people
from
all
over
the
world
love
animals
cats
dogs
morf
form
lla
—–
mfor
ghjk
eolv
lal
drlow
—–
Sample Output
form
from
morf
——————–
No Answer Found
——————–
love
——————–
all
lla
——————–
world
——————–
# 5 Requirements
¡ For the constraints given above, your program should run in 3 seconds. You must submit
source code for a program written in C#/C++/Java on the Electronic Assignment System.
