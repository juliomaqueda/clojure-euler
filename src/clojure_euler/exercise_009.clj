(ns clojure-euler.exercise-009
  (:gen-class))


;; A Pythagorean triplet is a set of three natural numbers, a < b < c, for which:
;;
;; a^2 + b^2 = c^2
;;
;; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
;;
;; There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.

(defn- other-triangle-side-size [side-size perim]
  (let [other-sizes (- perim side-size)
        div1 (- (* other-sizes other-sizes) (* side-size side-size))
        div2 (* 2 other-sizes)]
    (/ div1 div2)))

(defn euler-009 [perim]
  (loop [side-size (if (odd? perim) 1 2)]
    (if (< side-size perim)
      (let [other-side-size (other-triangle-side-size side-size perim)]
        (if (integer? other-side-size)
          (* side-size other-side-size (- perim side-size other-side-size))
          (recur (+ side-size 2)))))))