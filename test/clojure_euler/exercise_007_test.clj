(ns clojure-euler.exercise-007-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-007 :refer :all]))


(deftest euler-007-test
  (let [valid-input 10001
        expected-result 104743]
    (testing "Testing euler-007"
      (is (= expected-result (euler-007 valid-input))))))


;; Run all tests
(run-tests)