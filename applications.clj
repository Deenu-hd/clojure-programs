;Desktop See-saw
(ns web.core
   (:gen-class)
   (:require [seesaw.core :as seesaw]))

(def window (seesaw/frame
   :title "First Example"
   :content "hello world"
   :width 200
   :height 50))
(defn -main
   [& args]
   (seesaw/show! window))

;Desktop Changing the Value of Text
(def window (seesaw/frame
   :title "First Example"
   :content "hello world"
   :width 200
   :height 50))
(defn -main
   [& args]
   (seesaw/show! window)
   (seesaw/config! window :content "Good Bye"))

;alert window
(def window (seesaw/frame
   :title "First Example"
   :content "hello world"
   :width 200
   :height 50))
(defn -main
   [& args]
   (seesaw/show! window)
   (seesaw/alert "Hello World"))