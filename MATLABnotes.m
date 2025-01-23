clc %clear
m = 25; %kg
gravity = 9.81; %m/s^2

w = m*gravity

%% <-- adds a section divider

v_1 = [4 3 7 8]

%[2,6]
v_2 = 2:6 

%odd numbers 1-9; 1 to 9 with steps of 2; steps can be + or -
v_3 = 1:2:9 

v_4 = 9:-2:1

%4-48 in twelve steps
ls_1 = linspace(4,48,12)

%10^1-10^4 in 4 steps
logs_1 = logspace(1,4,4) 

%puts matrices in the same row of a new matrice
newvec_1 = [v_3 ls_1] 

%call single element from vector; places start from 1 rather than 0
newvec_1(10)

%store elements from made matrice and storing them in a new matrice
b_1 = [newvec_1(4:6)]

%redefine value of elem. by calling its index and assigning a different #
v_1(2)=17

%add another element to matrice
v_1(8)=99

%how to make columns
c = [1;2;3;4]

%transpose - 1x4 into 4x1 done with apostrophe or t?
w = [1 3 2 -5]
w'

%rows and columns
yas = [1 5 7 3 5; 2 2 2 9 0]

%random numbers
rand(2)
%specify row and columns
rand(3,5)
%give range and matrix dimensions 
randi([5,10],2,5)



mat_2 = [2:4;9:11]
%call certain element
mat_2(2,3)
%call pieces of row
mat_2(1:2,2:3)
%call entire row/column
mat_2(:,2)
