# CrashDemo

This is a test application designed to intentionally trigger common Android runtime anomalies. It is intended for use with monkey testing and monitoring tools to verify their ability to detect and report these issues.

## Features

The application provides a simple user interface with buttons to trigger the following events:

1.  **Java Crash**: Throws a `RuntimeException` to simulate a fatal application crash.
2.  **ANR (Application Not Responding)**: Blocks the main thread for 10 seconds, triggering the system's ANR dialog.
3.  **UI Jank (Frame Drops)**: Blocks the main thread for 2 seconds to simulate severe UI stuttering and dropped frames.

## Usage

1.  Launch the application.
2.  Click the corresponding button to trigger the desired anomaly.
