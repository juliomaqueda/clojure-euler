(ns clojure-euler.exercise-005-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-005 :refer :all]))


(deftest euler-005-test
  (let [valid-input 20
        expected-result 232792560]
    (testing "Testing euler-005"
      (is (= expected-result (euler-005 valid-input))))))


;; Run all tests
(run-tests)