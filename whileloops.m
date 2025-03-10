%% Example 1
clear; clc;
count = input('up to what number do you want to count: ');
i = 1;
while i <= count
    fprintf('Count: %d\n', i);
    i=i+1;
end
disp('Loop finished!');

%% Example 2
clear;clc;
count = input('up to what number you want to count: ');
i=1;
% While loop to print numbers from 1 to 5
while i <= count
fprintf('Count: %d\n', i);
i=i+1;
pause % click enter after ever iteration of loop
end
disp('Loop finished!');

%% Measuring Elapsed Time
clear;clc;
tic
A = randi(12000,4400);
B = randi(12000,4400);
toc

%% Example 3
clear;clc;
target = randi([1 20]);
guess = 0;
disp('Guess a number between 1 and 20!');

while guess ~= target
    tic
    guess = input('Enter your guess: ');
    if guess < target
        disp('Too low! Try again.');
    elseif guess > target
        disp('Too high! Try again.');
    else
        disp('Congratulations! You guessed the correct number!');
    toc
    end
end

%% Logical Operators

% and : &&
% or : ||
% not : ~
