%% Q1
clear; clc;

t = linspace(0, 2*pi, 75);

r = 1.5;

x = r*cos(t);
y = r*sin(t);
y=y';

z = sqrt(5 - x.^2 - y.^2);

figure
surf(x,y,z)
colormap jet; colorbar
title('Question One - Nua')
xlabel('X-axis')
ylabel('Y-axis')
zlabel('Z-axis')

%% Q2
clear; clc

x = -10:0.01:20;

y = 2*x.^3 - 25*x.^2 - 56*x + 196;

plot(x,y)
ylim([-1000 1000])
grid on
[x_root, y_root] = ginput(3);

fileID = fopen('q2_roots.txt','w');
    %  %.2f is a floating point number
    %  %d is an integer
    %  %s is for string
    %  \n is for next line
fprintf(fileID, ' %.2f \n', x_root);
fclose(fileID);

%% Q3
clear; clc

concret_data = readtable('Concrete_Data_all.xls');

strength_data = concret_data.strength;
avg_comp_strength = mean(strength_data);

f_min = min(strength_data);
f_max = max(strength_data);

water = concret_data.Water;
cement = concret_data.Cement;

w_c = water./cement;
avg_w_c = mean(w_c);
plot(w_c, strength_data, 'ob');
hold on
yline(avg_comp_strength, '--r');
xline(avg_w_c, '--k');
ylim([0 100]);
yticks(0:20:100)
xticks(0:0.5:2)
xlim([0 2])
