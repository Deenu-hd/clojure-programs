(println (vector 1 2 3))
(println (vector-of :int 1 2 3))
(println (vector-of :float 1 2 3))
(println (nth (vector 1 2,3) 0))
(println (nth (vector 1 2,3) 2))
(println (get (vector 3 2 1) 2))
(println (conj (vector 3 2 1) 5))
(println (pop (vector 3 2 1)))  ;Returns the new vector without the last item
(println (subvec (vector 1 2 3 4 5 6 7) 2 5))