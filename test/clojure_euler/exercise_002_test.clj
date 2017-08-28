(ns clojure-euler.exercise-002-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-002 :refer :all]))


(deftest euler-002-test
  (let [valid-input 4000000
        expected-result 4613732]
    (testing "Testing euler-002 with valid input"
      (is (= expected-result (euler-002 valid-input))))))


;; Run all tests
(run-tests)