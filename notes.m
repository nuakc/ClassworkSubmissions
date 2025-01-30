%%SUM
clc %clear
%creates a 3x5 matrice with random numbers from 5-10
a = randi([5 10], 3, 5)

%0 = not >8; 1 = yes >8
b = a>8

%sums amount of #>8 in each row; returns 3x5 
sum(a>8)

%sums total # of elements that are >8
sum(sum(a>8))

%%FIND
meta = [1 4 8 5; 5 8 2 5]

%finds where elements of meta matrice = 5, counts bottom to top one by one
find(meta == 5)

%gives 
meta(ans)

%gives specific index of elements in meta matrice that = 5
[r,c] = find(meta == 5)

%%
mat_a = [1 2 3; 10 20 30; 100 200 300]

mat_b = mat_a*20

%note: you canot divide by a matrice but you can divide a matrice by a #
%note: for matrice mult. # of columns of mat_1 have to be = to # of rows
%in mat_2........ex)

mat_1 = [4 5;2 3]
mat_2 = [1 2;3 4]
mat_1*mat_2
%order of multiplying matrices matters
mat_2*mat_1

%%
[6 2 3 4]*[5;3;7;1]

[5;3;7;1]*[6 2 3 4]

lam = [4 1;9 3]
lam^2
lam*lam

%element wise multiplication; matrices must have exact same dimensions
[4 1;9 3].*[4 1;9 3]
