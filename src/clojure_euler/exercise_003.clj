(ns clojure-euler.exercise-003
  (:gen-class))


;; The prime factors of 13195 are 5, 7, 13 and 29.
;;
;; What is the largest prime factor of the number 600851475143 ?

(defn euler-003 [num]
  (loop [factor 2 target num max-factor num]
    (if (> factor target)
      max-factor
      (if (zero? (mod target factor))
        (recur factor (/ target factor) factor)
        (recur (if (odd? factor) (+ factor 2) (inc factor)) target max-factor)))))