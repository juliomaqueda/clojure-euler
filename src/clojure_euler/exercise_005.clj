(ns clojure-euler.exercise-005
  (:gen-class))


;; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;;
;; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn- prime? [num]
  (or (= num 2)
      (not-any? #(zero? (mod num %)) (cons 2 (range 3 (inc (Math/sqrt num)) 2)))))

(defn- max-exp [num limit]
  (loop [max-num num]
    (let [next-num (* max-num num)]
      (if (> next-num limit) max-num (recur next-num)))))

(defn euler-005 [limit]
  (->> (range limit 1 -1)
       (filter prime?)
       (map #(max-exp % limit))
       (reduce *)))