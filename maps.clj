;Map is a collection that maps keys to values

(def keymaps (hash-map "x" "5" "y" "6" "z" "7"))
(println keymaps)

(def demokeys (sorted-map "z" "1" "b" "2" "a" "3"))
(println demokeys)
(println (get demokeys "b"))    ;get
(println (contains? demokeys "a"))  ;contains
(println (find demokeys "z"))
(println (find demokeys "x"))    ;find
(println (keys demokeys))        ;keys
(println (vals demokeys))        ;vals
(println (dissoc demokeys "a"))  ;dissociated key

(println (merge demokeys keymaps))

(defn demo []                                   ;merge-with
   (def k1 (hash-map "z" 6 "b" 7 "a" 8))
   (def k2 (hash-map "a" 2 "h" 5 "i" 7))
   (println (merge-with + k1 k2)))
(demo)

(println (select-keys demokeys ["z" "a"]))  ;select-keys

(def new (set/rename-keys demokeys {"z" "newz" "b" "newb" "a" "newa"}))
(println new))