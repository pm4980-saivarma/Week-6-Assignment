# Week 5 Assignment

This repository contains five Java solutions for the fantasy sports programming
assignment. Each problem is stored in its own folder and includes the Java
source file and the compiled `.class` file.

## Problems

### Problem 1: Fantasy Team Score Multiplier

`applyMultipliers(...)` directly updates the captain's score by `2.0` and the
vice-captain's score by `1.5`.

### Problem 2: Duplicate Player Pick Checker

`findDuplicatePick(...)` uses nested loops to find and report the first repeated
player name.

### Problem 3: Top Performer Tracker

`findMinMaxSpread(...)` finds the minimum, maximum, and spread in one pass
without sorting the input array.

### Problem 4: Match Day Grid Analyzer

`classifyMatches(...)` uses the reusable `rowAverage(...)` helper to classify
each match as `Power Surge` or `Normal`.

### Problem 5: Fantasy League Auto-Draft Ranking Engine

`Player` demonstrates overloaded draftability checks, encapsulated fields,
`Comparable<Player>`, and `Arrays.sort(...)` for descending batting-average
ranking.

## Folder Structure

```text
Problem1_FantasyTeamScoreMultiplier/
Problem2_DuplicatePlayerPickChecker/
Problem3_TopPerformerTracker/
Problem4_MatchDayGridAnalyzer/
Problem5_FantasyLeagueAutoDraftRankingEngine/
```

## Compile and Run

From the repository root, compile each folder:

```powershell
javac Problem1_FantasyTeamScoreMultiplier\*.java
javac Problem2_DuplicatePlayerPickChecker\*.java
javac Problem3_TopPerformerTracker\*.java
javac Problem4_MatchDayGridAnalyzer\*.java
javac Problem5_FantasyLeagueAutoDraftRankingEngine\*.java
```

Run the sample programs:

```powershell
java -cp Problem1_FantasyTeamScoreMultiplier FantasyTeamScoreMultiplier
java -cp Problem2_DuplicatePlayerPickChecker DuplicatePlayerPickChecker
java -cp Problem3_TopPerformerTracker TopPerformerTracker
java -cp Problem4_MatchDayGridAnalyzer MatchDayGridAnalyzer
java -cp Problem5_FantasyLeagueAutoDraftRankingEngine Player
```
