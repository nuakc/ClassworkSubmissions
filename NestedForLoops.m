%% Example 1
clear;clc;
rows = 3;
columns = 5;

for i = 1:rows %loops through all rows
    %for every row print a * and then go to next line \n
    for j = 1:columns
        fprintf('*');
    end
fprintf('\n');
end

%% Example 2
clear;clc;
rows1 = 3;
columns1 = 4;

A = randi([1 10], rows1, columns1);
disp('Original Matrix A: '); disp (A);

for  i = 1:rows1 % Nested for loops to process each element of the matrix
    for j = 1:columns1
    B(i, j) = A(i, j)^2; % Example operation: square each element
    end
end

disp('Matrix B (squared elements of A):'); % Display the resulting matrix
disp(B);

%% Example 3
clear; clc;
rows = 4;
cols = 5;

A = randi([1, 10], rows, cols);
disp('Original Matrix A: '); disp(A) % Display the original matrix

rowSums = zeros(rows, 1); % Initialize a vector to store row sums

for i = 1:rows
sumValue = 0; % Initialize sum for the row
    for j = 1:cols
    sumValue = sumValue + A(i, j);
    end
rowSums(i) = sumValue; % Store the computed sum
end
disp('Sum of each row:'); disp(rowSums); % Display the row sums
