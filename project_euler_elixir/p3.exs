defmodule LargestPF do
  def largestPF(_, n, largest) when n==1 do
    largest
  end

  def largestPF(currTest, n, largest) do
    if rem(n, currTest) == 0 do
      largestPF(2, div(n, currTest), currTest)
    else
      largestPF(currTest+1, n, largest)
    end
  end

  def largestPF(n) do
    largestPF(2, n, 0)
  end
end

IO.puts LargestPF.largestPF(600851475143)
