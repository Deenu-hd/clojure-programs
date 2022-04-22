;atom   @ is to access atom value
(def myatom (atom 1))
   (println @myatom)
   
;reset!
(reset! myatom 2)
   (println @myatom)
   
;compare-and-set!
;The atom with the new value will be set only if the old value is specified properly
(compare-and-set! myatom 4 10)
   (println @myatom)
(compare-and-set! myatom 2 10)
   (println @myatom)
   
;swap!  The atom with the new value will be set based on the function provided
(swap! myatom inc)
   (println @myatom)