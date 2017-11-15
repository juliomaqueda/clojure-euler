(ns clojure-euler.exercise-009-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-009 :refer :all]))


(deftest euler-009-test
  (let [valid-input 1000
        expected-result 31875000]
    (testing "Testing euler-009 with valid value"
      (is (= expected-result (euler-009 valid-input))))
    (testing "Testing euler-009 with invalid value"
      (is (nil? (euler-009 (inc valid-input)))))))


;; Run all tests
(run-tests)