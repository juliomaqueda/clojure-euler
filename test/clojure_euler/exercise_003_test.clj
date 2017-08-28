(ns clojure-euler.exercise-003-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-003 :refer :all]))


(deftest euler-003-test
  (let [valid-input 600851475143                            ; expected result ;; 71 × 839 × 1471 × 6857
        expected-result 6857]
    (testing "Testing euler-003 with valid input"
      (is (= expected-result (euler-003 valid-input))))))


;; Run all tests
(run-tests)