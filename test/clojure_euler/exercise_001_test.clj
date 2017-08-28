(ns clojure-euler.exercise-001-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-001 :refer :all]))


(deftest euler-001-test
  (let [valid-input 1000
        expected-result 233168]
    (testing "Testing euler-001 with valid input"
      (is (= expected-result (euler-001 valid-input))))))


;; Run all tests
(run-tests)