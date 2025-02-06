clc
x = input('Input any number:');
if x > 0
    disp(['Positive number']);
elseif x < 0
    disp(['Negative number']);
else 
    disp(['Zero']);
end

%% 
clear;clc;
score = input('What is your grade?:');

if score >= 90
    grade = 'A';
elseif score >= 80
    grade = 'B';
elseif score >= 70
    grade = 'C';
else
    grade = 'FAIL';
end 
disp(['Grade:', grade])

%% Activity 2
clear;clc;
sqr = input('Give me a number:');

if square >= 0 
    x = sqrt(sqr);
    disp(['The squareroot of this number is ', num2str(x), '.'])
else
    disp(['The square of this number is imaginary.'])
end

%% Activity 3
clear;clc; 
fact = input('Pick a number and I will provide the factorial:');

for i = 1:fact-1
    fact = fact*i;
    disp (fact)
end
%%
