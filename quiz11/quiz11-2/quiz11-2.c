/*
20123373 ¼º¹Î°æ
quiz11-2.Negative Binomial Distribution
*/
#include <stdio.h>
#include <string.h>

#ifndef BOOL
typedef int BOOL;
#define FALSE 0      
#define TRUE !FALSE
#endif

static double ComputerFactorial(const double f);
static double ComputerPermutation(const double n, const double r);
static double ComputerCombination(const double n, const double r);
static double ComputeNegativeBinomialDist(const double failure, const double success, const double prob, const BOOL cumulative);
static double ComputeMeanNegativeBionomialDist(const double success, const double prob);
static double ComputeVarNegativeBinomialDist(const double success, const double prob);

int main(void)
{

}
static double ComputerFactorial(const double f)  //n!=n*(n-1)*....*1 
{
	if (f == 0)
		return 1;
	else
		return f*ComputerFactorial(f - 1);

}
static double ComputerPermutation(const double n, const double r)   //nPr = n!/(n-r)!
{
	return ComputerFactorial(n) / ComputerFactorial(n - r);
}
static double ComputerCombination(const double n, const double r)   //nCr = nPr/r!
{
	return ComputerPermutation(n, r) / ComputerFactorial(r);
}
static double ComputeNegativeBinomialDist(const double failure, const double success, const double prob, const BOOL cumulative)
{

}
static double ComputeMeanNegativeBionomialDist(const double success, const double prob)
{

}
static double ComputeVarNegativeBinomialDist(const double success, const double prob)
{

}