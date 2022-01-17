# 2DARRAY
A biologist experimenting with DNA modification of bacteria has found a way to make bacterial colonies sensitive to the surrounding population density.  By changing the DNA, he is able to “program” the bacteria to respond to the varying densities in their immediate neighborhood. 

The culture dish is a square, divided into 100 smaller squares (10x10). Population in each small square is measured on a four point scale (from 0 to 3). The DNA information is represented as an array D, indexed from 0 to 15, of integer values and is interpreted as follows:

In any given culture dish square, let K be the sum of that square's density and the densities of the four squares immediately to the left, right, above and below that square (squares outside the dish are considered to have density 0). Then, by the next day, that dish square's density will change by D[K] (which may be a positive, negative, or zero value).  The total density cannot, however, exceed 3 nor drop below 0.

Now, clearly, some DNA programs cause all the bacteria to die off (e.g., [-3, -3, …, -3]). Others result in immediate population explosions (e.g., [3,3,3, …, 3]), and others are just plain boring (e.g., [0, 0, … 0]).  The biologist is interested in how some of the less obvious DNA programs might behave.

Write a program to simulate the culture growth, reading in the number of days to be simulated, the DNA rules, and the initial population densities of the dish.
