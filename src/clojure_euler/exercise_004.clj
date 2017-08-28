(ns clojure-euler.exercise-004
  (:gen-class))


;; A palindromic number reads the same both ways. The largest palindrome made from the product
;; of two 2-digit numbers is 9009 = 91 × 99.
;;
;; Find the largest palindrome made from the product of two 3-digit numbers.

(defn- is-reversible? [num]
  (= num (Integer. (clojure.string/reverse (str num)))))

(defn- has-dividers? [num]
  (some #(zero? (mod num %)) (range 999 (dec (int (Math/sqrt num))) -1)))

(defn euler-004 []
  (first (filter #(and (is-reversible? %) (has-dividers? %))
                 (range (* 999 999) (dec (* 100 100)) -1))))