numerator = 21..40 |> Enum.reduce(&(&1*&2))
IO.inspect 1..20 |> Enum.reduce(numerator, &(div(&2,&1)))
