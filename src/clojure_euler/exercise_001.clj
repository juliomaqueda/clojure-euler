(ns clojure-euler.exercise-001
  (:gen-class))


;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
;; The sum of these multiples is 23.
;;
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn euler-001 [limit]
  (let [limit (dec limit)
        sum-1n #(/ (* % (inc %)) 2)
        num-divisors #(int (/ limit %))
        sum-divisors #(* % (sum-1n (num-divisors %)))]
    (- (+ (sum-divisors 3) (sum-divisors 5)) (sum-divisors 15))))