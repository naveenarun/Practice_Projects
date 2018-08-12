pyr = "75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"

toInt=&String.to_integer/1

pyr_int = Enum.map(String.split(pyr, "\n"), &(Enum.map(String.split(&1, " "), toInt)))

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
