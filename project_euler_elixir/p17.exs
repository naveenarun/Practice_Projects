defmodule Q17 do
  def writeout(n) do
    digits = %{'0' => "", '1' => "one", '2' => "two", '3' => "three", '4' => "four", '5' => "five", '6' => "six", '7' => "seven", '8' => "eight", '9' => "nine", '10' => "ten", '11' => "eleven", '12' => "twelve", '13' => "thirteen", '14' => "fourteen", '15' => "fifteen", '16' => "sixteen", '17' => "seventeen", '18' => "eighteen", '19' => "nineteen"}
    tens = %{'1' => "ten", '2' => "twenty", '3' => "thirty", '4' => "forty", '5' => "fifty", '6' => "sixty", '7' => "seventy", '8' => "eighty", '9' => "ninety"}
    n_char = to_charlist(n)
    n_size = length(n_char)
    thousands = cond do
      #n_size >= 4 -> Map.get(digits, '1') <> " thousand"
      n_size >= 4 -> Map.get(digits, [Enum.at(n_char, n_size-4)]) <> " thousand"
      true -> ""
    end
    hundreds = cond do
      thousands != "" and [Enum.at(n_char, n_size-3)] == '0' -> ""
      n_size >= 3 -> Map.get(digits, [Enum.at(n_char, n_size-3)]) <> " hundred"
      true -> ""
    end
    onesplace = [Enum.at(n_char, n_size-1)]
    tens = if rem(n, 100) > 9 do
      tensplace = [Enum.at(n_char, n_size-2)]
      cond do
        rem(n, 10) == 0 -> Map.get(tens, tensplace)
        rem(n, 100) < 20 -> Map.get(digits, tensplace ++ onesplace)
        true -> Map.get(tens, tensplace) <> " " <> Map.get(digits, onesplace)
      end
    else
      Map.get(digits, onesplace)
    end
    linker = if hundreds != "" and tens != "" do
      " and "
    else
      ""
    end
    mystr = thousands <> hundreds <> linker <> tens
    String.replace(mystr, " ", "") |> String.length
  end
end

IO.puts 1..1000 |> Enum.map(&Q17.writeout/1) |> Enum.sum
