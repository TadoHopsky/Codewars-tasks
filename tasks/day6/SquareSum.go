package main

import (
	"fmt"
	"math"
)

/*
Complete the square sum function so that it squares each number passed into
it and then sums the results together.
*/

func main() {
	fmt.Println(SquareSum([]int{1, 2}))
}

func SquareSum(numbers []int) int {
	var sum float64
	for i := 0; i < len(numbers); i++ {
		sum += math.Pow(float64(numbers[i]), 2)
	}
	return int(sum)
}
