/*
20123373 성민경
quiz11-1. Binomial Distribution
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
static double ComputeBinomialDist(const double num, const double trial, const double prob, const BOOL cumulative);
static double ComputeMeanBionomialDist(const double trial, const double prob);
static double ComputeVarBinomialDist(const double trial, const double prob);

int main(void)
{
	double Number_s = 0.0, Trials = 0.0;
	double Probability_s = 0.0;
	BOOL Cumulative = 0;//flase 이면 하나만 true이면 이하값 전체.
	char Scumulative[10];
	

	printf("Number_s : ");
	scanf_s("%lf", &Number_s);
	printf("Trials : ");
	scanf_s("%lf", &Trials);
	printf("Probability_s : ");
	scanf_s("%lf", &Probability_s);
	fgets(Scumulative, sizeof(Scumulative), stdin); // \n도 입력으로 받기때문에
	
	printf("Cumulative(true or false?) : ");
	fgets(Scumulative, sizeof(Scumulative), stdin); //true or false 문자열 입력받음.    
	
	if(!strncmp(Scumulative,"true",4*sizeof(char))) {  // 문자열 비교후 true 이면 TRUE저장
		Cumulative = TRUE;
	}
	else if(!strncmp(Scumulative,"false",5 * sizeof(char))){  //문자열 비교후 flase 이면 FALSE저장
		Cumulative = FALSE;
	}
	else {                                                 //예외처리
		printf("true or false 둘중 하나 입력하시오.\n");
		return 0;
	}
	

	printf("\n");
	printf("Binomial Distribution Probability \n");
	printf("= %lf \n", ComputeBinomialDist(Number_s, Trials, Probability_s, Cumulative));
	printf("\n");
	printf("Mean of Binomial Distribution");
	printf("= %3.0lf \n", ComputeMeanBionomialDist(Trials, Probability_s));
	printf("\n");
	printf("Variance of  Binomial Distribution");
	printf("= %3.1lf \n", ComputeVarBinomialDist(Trials,Probability_s));
	printf("\n");

	return 0;
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
static double computeFirstSqare(const double num, const double prob)   // (prob) num승 을 구해주는 함수.
{
	int i = 0;
	double firstSqare = 1.0;
	for (i = 0; i < num; i++) {
		firstSqare *= prob;
	}
	return firstSqare;
}
static double computeSecondSqare(const double num, const double prob, const double trials)   // (1-prob)  trials-num승 을 구해주는 함수.
{
	int i = 0;
	double secondSqare = 1.0;
	for (i = 0; i < trials-num; i++) {
		secondSqare *= (1-prob);
	}
	return secondSqare;
}
static double ComputeBinomialDist(const double num, const double trials, const double prob, const BOOL cumulative)  // False 일때 trials  C  num * (prob) number승  * (1-prob) trials-num승 True일떄는 num이하 확률 다 더해줘야함.
{
	double TrueReturnValue=0;
	int i = 0;

	if (cumulative == TRUE) {
		for (i = 0; i <= num; i++) {
			TrueReturnValue += ComputerCombination(trials, i)*computeFirstSqare(i, prob)*computeSecondSqare(i, prob, trials);
		}
		return TrueReturnValue;
	}
	else {
		return ComputerCombination(trials, num)*computeFirstSqare(num, prob)*computeSecondSqare(num, prob, trials);
	}
}
static double ComputeMeanBionomialDist(const double trial, const double prob)  //평균
{
	return trial*prob;
}
static double ComputeVarBinomialDist(const double trial, const double prob) //분산
{
	return trial*prob*(1 - prob);
}