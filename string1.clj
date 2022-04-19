(println (str "Hello" "World"))
(println (str "Hello" "World" "Good" "Morning"))

(def s "Strings")
(println (type s))
(println (count s))
(println (subs s 2 5))
(println (subs "String" 2))
(println (compare "string" "STRING"))
(println (compare "Hello" "Hello"))

(println (format "My name is %s %s" "deenu" "hd"))
(println (format "My Number is %s %d" "Ph:" 1234556))
(println (format "Pi: %.3f" 3.14159265))

(println (clojure.string/lower-case "HelloWorld"))
(println (clojure.string/upper-case "helloworld"))

(println (clojure.string/join ", " [1 2 3]))
(println (clojure.string/join "| " [1 2 3]))

;regular expressions
(println (clojure.string/split "Hello World" #"o"))

(println (reverse "Hello World"))
(println (clojure.string/replace "Good Morning" #"Morning" "Afternoon"))

