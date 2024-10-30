(ns thats-dice.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;Big Difference: trying to not use macros

;Goals:
;Dice roll statistical analyzer
;Given a number and size of dice, produce a vector
;
;
;---- DATA DEFINITIONS ----
;Data Definition:

;DiceNumber
;DESC: A number of dice

;DiceSize
;DESC: The number of sides on a a die

;Result
;DESC:

;Dice Table --- (# of dice) + (size of dice) + (all possible results)
;1d1 -> 1
;1d2-> 1, 2
;2d2 -> 1, 3, 3, 4 --- [1,1] [2,1] [1,2] [2,2]
;2d3 -> 
