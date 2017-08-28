(ns clojure-euler.exercise-007
  (:gen-class))


;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;;
;; What is the 10001st prime number?

(defn- prime? [num]
  (or (= num 2)
      (not-any? #(zero? (mod num %)) (cons 2 (range 3 (inc (Math/sqrt num)) 2)))))

(defn euler-007 [pos]
  (loop [current-num 3 current-pos 2]
    (if (= pos current-pos)
      current-num
      (let [next-num (+ current-num 2)]
        (recur next-num (if (prime? next-num) (inc current-pos) current-pos))))))