defmodule Q7 do
  def expand_n_times(pcache, new_test, n) when n>0 do
    if is_prime(new_test, pcache) do
      pcache = pcache ++ [new_test]
      #IO.inspect n
      expand_n_times(pcache, new_test+1, n-1)
    else
      expand_n_times(pcache, new_test+1, n)
    end
  end

  def expand_n_times(pcache, _, n) when n==0, do: pcache

  def expand_n_times(n) do
    pcache = [2]
    expand_n_times(pcache, 3, n-1)
  end

  def is_prime(n, pcache) do
    not(Stream.map(pcache, &(rem(n, &1))) |> Enum.any?(&(&1 == 0)))
  end
end

upto = 10001
IO.puts Q7.expand_n_times(upto) |> List.last
