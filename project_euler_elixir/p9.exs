intSquare = fn x -> x * x end
intSqrt = fn x -> Kernel.round(:math.sqrt(x)) end
isPerfectSquare? = fn x -> intSquare.(intSqrt.(x)) == Kernel.round(x) end
isTriple? = fn a, b -> isPerfectSquare?.(:math.pow(a,2)+:math.pow(b,2)) end
isSumN? = fn a, b, n -> a+b+intSqrt.(a*a+b*b) == n end

targetSum = 1000

triplesForN = fn n -> n..1000-n |> Enum.filter(&(isTriple?.(n, &1))) |> Enum.filter(&(isSumN?.(n, &1, targetSum))) |> Enum.map(&(&1*n*intSqrt.(&1*&1+n*n))) end

IO.inspect 1..1000 |> Enum.map(&(triplesForN.(&1))) |> Enum.max
