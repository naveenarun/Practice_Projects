pyr = File.read! "p067_triangle.txt"

pyr_split = String.split(pyr, "\n")
pyr_slice = pyr_mini=Enum.slice(pyr_split,0..99)

toInt=&String.to_integer/1

pyr_int = Enum.map(pyr_slice, &(Enum.map(String.split(&1, " "), toInt)))

defmodule Q18 do
  def tget(pyr, r, c) do
    if c < 0 or c > r do
      0
    else
      Enum.at(Enum.at(pyr, r), c)
    end
  end

  def maxTreeRow(pyr) do
    upto = length(pyr) - 1
    Enum.max(maxTreeRow(pyr, 1, Enum.at(pyr,0), upto))
  end

  def maxTreeRow(pyr, r, prevMaxRow, upto) do
    if r > upto do
      prevMaxRow
    else
      sumTuple = &(elem(&1,0)+elem(&1,1))
      maxTuple = &(Enum.max(Tuple.to_list(&1)))
      sumLists = &(Enum.map(Enum.zip(&1, &2), sumTuple))
      maxLists = &(Enum.map(Enum.zip(&1, &2), maxTuple))
      prevRow = prevMaxRow
      addLeft = prevRow ++ [0]
      addRight = [0] ++ prevRow
      currRow = Enum.at(pyr, r)
      thisMaxRow = sumLists.(currRow, maxLists.(addLeft, addRight))
      maxTreeRow(pyr, r+1, thisMaxRow, upto)
    end
  end

  def maxsum(pyr) do
    maxsum(pyr, length(pyr)-1, 0, tget(pyr, 0, 0), 0)
  end
  def maxsum(pyr, upto, prev_idx, total, prev_row) do
    curr_row = prev_row + 1
    if curr_row > upto do
      total
    else
      left = tget(pyr, curr_row, prev_idx)
      right = tget(pyr, curr_row, prev_idx+1)
      cond do
        left > right -> maxsum(pyr, upto, prev_idx, total+left, curr_row)
        left < right -> maxsum(pyr, upto, prev_idx+1, total+right, curr_row)
        left == right -> max(maxsum(pyr, upto, prev_idx, total+left, curr_row), maxsum(pyr, upto, prev_idx+1, total+right, curr_row))
      end
    end
  end
end

IO.inspect Q18.maxTreeRow(pyr_int)
