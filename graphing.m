clear;clc

x = -2*pi:0.01:2*pi;

y = sin(x);

plot(x,y);

%%
x = -2*pi:0.01:2*pi;

y1 = sin(x);
y2 = cos(x);

plot(x,y1,x,y2); % or plot first, then "hold on" then plot next graph
% use "hold off" to turn off hold on
% for multiple windows use "figure" after first plot 
