# GitCoin -- Ying Xin Jiang, Jason Kim, Mohtasim Howlader
## L 00 -- But What Does the Data Say?
Hypothesis: For an n by n matrix, the worst case execution time for our serach method is O(n) because the worst case is if the number we are searching for is not in the array and the worst route it can take it a diagonal path, which is O(2n-1). 

Background: The problem asks us to search for an integer in an n by n matrix in that is ascending left to right and top to bottom. Our goal is to write an algorithm that can do this with O(n) complexity. 


Experiment Methodology:

In order to see meaningful results, we started testing from a 1000 by 1000 matrix, and went all the way to 10000 by 10000 in increments of 1000. 


Results:
![](Pictures/graph1.PNG)
![](Pictures/graph2.PNG)

