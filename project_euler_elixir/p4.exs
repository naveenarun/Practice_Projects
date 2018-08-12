defmodule Palindrome do
  def isPalindrome?(x) do
    x_str = to_string x
    x_str == String.reverse x_str
  end

  def isProdPalindrome?(x, y) do
    isPalindrome?(x*y)
  end
end

highestPalForN = fn n ->
  n..999
  |> Enum.filter(&(Palindrome.isProdPalindrome?(&1, n)))
  |> Enum.map(&(&1*n))
  |> Enum.max(fn -> 0 end)
end

IO.inspect 100..999 |> Enum.map(&(highestPalForN.(&1))) |> Enum.max
