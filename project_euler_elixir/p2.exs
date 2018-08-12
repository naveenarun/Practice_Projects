defmodule Fibo do
	def fiboSum(a, b, accum, maxval) when (b < maxval) do
		accum = 
		  if (rem(b, 2) == 0) do
		    accum + b
		  else
		    accum
		  end
		c = a + b
		fiboSum(b, c, accum, maxval)
	end

	def fiboSum(_, b, accum, maxval) when (b >= maxval) do
		IO.puts(accum)
	end
end

Fibo.fiboSum(1, 1, 0, 4.0e6)
