defmodule Q25 do
  def fiboUpTo(upto) do
    fiboUpTo(1, 1, 3, upto)
  end

  def fiboUpTo(p1, p2, curr_i, upto) do
    curr_val = p1 + p2
    #curr_val_length = 1 + (trunc :math.log10(curr_val))
    curr_val_length = String.length(to_string curr_val)
    cond do
      curr_val_length >= upto -> curr_i
      true -> fiboUpTo(p2, curr_val, curr_i + 1, upto)
    end
  end
end

IO.inspect Q25.fiboUpTo(1000)
