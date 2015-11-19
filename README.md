# AdditionMethods
## INTRODUCTION

 This project will introduce using the "for" loop as well as making use of methods outside of the main method.  These methods will make it easier to produce and use variables while the "for" loop will increase the simplicity of our addition game drastically.

## OUTLINE

We will use the base code from the addition game assignment.

Score, difficulty, and the numbers used in the problem will be dealt with, processed, and returned to the main method using other methods.

The main method will contain a "for" loop that will repeat a round from the addition game four times, and then give a final score.

## REFERENCES AND LITERATURE

Liang, Y. (2014). Introduction to Java programming: Comprehensive version (Tenth ed.). 

## CODE
``` Java
import java.util.Scanner;
public class AdditionMethods {
	public static void main(String[] args) {
		System.out.println("Booyah more addition game jazz");
		//Score, difficulty, and the Number Assignments will be given their own methods
		//The main method will contain the for loop that will put the user through the four-round addition game.
		int Score = 0;
		int Difficulty = 10;
		for (int i = 0; i <= 3; i++){
			// Round 1
			
			int num1 = (int)(Math.random()*Difficulty);
			int num2 = (int)(Math.random()*Difficulty);
			System.out.println("The first number is: " + num1);
			System.out.println("The second number is: " + num2);
			int realAnswer = (num1 + num2);
			//  Ask the user to add these two numbers together	
			System.out.println("If we add " + num1 + " and " + num2
					+ ", what is the answer?");
			
			
			//  Read in their response
			
			Scanner input = new Scanner(System.in);
			int givenAnswer = input.nextInt();
			
			//  Check if the answer was correct		
			
			if(realAnswer == givenAnswer){
			
			//		IF correct
				//			Tell them it was correct
				System.out.println("Correct!");
				//			Give them points
				Score = Score + Difficulty;
				System.out.println("Your score is now " + Score);
				//			Make the next question harder		
				Difficulty = Difficulty + 15;
				System.out.println("Making the next question harder. . .");
			}else{
				//		IF not correct
			
				//			Tell them it was wrong
				System.out.println("Sorry, that was incorrect.");
				// 			Tell them the correct answer
				System.out.println("The correct answer was " + realAnswer);
				//			Do not give them points
				System.out.println("Your score is still " + Score);
				//			Make the next question easier
				Difficulty = Difficulty - 5;
				System.out.println("Making the next question easier. . .");
			}
		}
		System.out.println(". . . Except there is no 'next question', the game is over!");
		System.out.println("Your final Score is " + Score + ", Congratulations!");
	}
}
```
## CONSOLE OUTPUT
```
Booyah more addition game jazz
The first number is: 5
The second number is: 1
If we add 5 and 1, what is the answer?
6
Correct!
Your score is now 10
Making the next question harder. . .
The first number is: 4
The second number is: 0
If we add 4 and 0, what is the answer?
4
Correct!
Your score is now 35
Making the next question harder. . .
The first number is: 27
The second number is: 10
If we add 27 and 10, what is the answer?
37
Correct!
Your score is now 75
Making the next question harder. . .
The first number is: 52
The second number is: 39
If we add 52 and 39, what is the answer?
91
Correct!
Your score is now 130
Making the next question harder. . .
. . . Except there is no 'next question', the game is over!
Your final Score is 130, Congratulations!
```
## COMMAND PROMPT
```
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.


C:\Users\LAB>T:

T:\>cd CSEclipseWorkspace

T:\CSEclipseWorkspace>cd AdditionMethods

T:\CSEclipseWorkspace\AdditionMethods>echo # AdditionMethods >> README.md

T:\CSEclipseWorkspace\AdditionMethods>git init
Reinitialized existing Git repository in T:/CSEclipseWorkspace/AdditionMethods/.
git/

T:\CSEclipseWorkspace\AdditionMethods>git add .

T:\CSEclipseWorkspace\AdditionMethods>git commit -m "first commit"
[master 1cd4271] first commit
 1 file changed, 1 insertion(+)

T:\CSEclipseWorkspace\AdditionMethods>git remote add origin https://github.com/N
oahCamp97/AdditionMethods.git

T:\CSEclipseWorkspace\AdditionMethods>git push -u origin master
Username for 'https://github.com': NoahCamp97
Password for 'https://NoahCamp97@github.com':
Counting objects: 12, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (9/9), done.
Writing objects: 100% (12/12), 1.54 KiB | 0 bytes/s, done.
Total 12 (delta 1), reused 0 (delta 0)
To https://github.com/NoahCamp97/AdditionMethods.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
``` 
```
Microsoft Windows [Version 6.3.9600]
(c) 2013 Microsoft Corporation. All rights reserved.

C:\Users\Noah>cd documents

C:\Users\Noah\Documents>cd "Java Backup"

C:\Users\Noah\Documents\Java Backup>cd AdditionMethods

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git
usage: git [--version] [--help] [-C <path>] [-c name=value]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Forward-port local commits to the updated upstream head
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch

   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git init AdditionMethods
Initialized empty Git repository in C:/Users/Noah/Documents/Java Backup/Addition
Methods/AdditionMethods/.git/

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git add .

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git config user.name "Noah C
amp"

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git config user.email "campn
@student.swosu.edu"

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git commit -m "Made Addition
 Game"
[master 7143b95] Made Addition Game
 1 file changed, 52 insertions(+), 2 deletions(-)

C:\Users\Noah\Documents\Java Backup\AdditionMethods>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': NoahCamp97
Password for 'https://NoahCamp97@github.com':
Counting objects: 4, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (4/4), 1.05 KiB | 0 bytes/s, done.
Total 4 (delta 1), reused 0 (delta 0)
To https://github.com/NoahCamp97/AdditionMethods
   cb0d5da..7143b95  master -> master
```
## SUMMARY

This project took an unexpected turn.  The original assignment was to reconfigure the addition game project to use methods.  However, because of the way my addition game was coded, it was very difficult to create even a testable build of the game that calculated any of its variables outside of the main method. I could not figure out how to reference what round the game was on within the other methods. The variable "i" which was used within the main method could not be returned as a variable, and thus could not be referenced when Score, for example, needed to know whether or not to initialize at 0.  Because methods are supposed to make our lives easier, not harder, I concluded that the implication of supplementary methods simply was not suitable for my project.  The "for" loop, on the other hand, worked exactly as intended, and made the code very concise and simple.  I look forward to using "for" loops and implementing functional methods into future projects.
