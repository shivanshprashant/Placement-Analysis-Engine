# Problem Statement & Scope

## Problem Statement
University placement cells often manually filter hundreds of student profiles to determine eligibility for varying tiers of corporate recruitment drives. This manual processing is time-consuming and prone to human error, particularly when balancing multiple metrics like academic scores (CGPA) and technical coding capabilities.

## Scope of the Project
This project provides a lightweight, automated command-line engine to handle preliminary candidate classification. It securely registers applicant data in-memory and applies a standardized algorithmic rule set to assign each profile to a predefined placement bracket. The current scope is limited to real-time session data processing without persistent database integration.

## Target Users
* University Placement Officers
* Departmental Academic Advisors
* Student Placement Coordinators

## High-Level Features
1. **Dynamic Applicant Registration:** Secure data ingestion via CLI.
2. **Automated Bracket Allocation:** Rule-based logic engine for tier placement.
3. **Robust Input Validation:** Exception handling to maintain system stability.
4. **Analytics Dashboard:** Centralized view of all processed candidate statuses.