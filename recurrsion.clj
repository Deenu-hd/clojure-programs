(defn demo7 []
   (loop [i 0]
      (when (< i 5)
      (println i)
      (recur (inc i)))))
(demo7)