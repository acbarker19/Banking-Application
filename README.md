# Banking Application
A simple banking application project from my second programming class, Programming and Problem Solving II, at the University of Mount Union that was taught by Dr. James Klayder.

Some prototype frames and code snippets were provided by Dr. James Klayder, and the project itself was created by a group consisting of Alec Barker, Jarrod Luca, and Cierra Roller. Some helper files are used that were created for Princeton University's CS department.

It is a simple banking application with two types of users, admins and regular users.
- Admins can search for users and can deposit and withdraw money from any account. The admin has a special frame to edit the accounts. They can search by username, and deposit or withdraw from the list of users that appear in the search. For example, if the admin searches for usernames starting with "j" and deposits $10, every account that starts with "j" will get $10.
- Regular users can log in but can only alter their own account by depositing or withdrawing money.

The admin account is:
- Username: admin
- Password: admin

One of the regular user accounts is:
- Username: jsmith
- Password: smith

Account information is stored in text files, and information regarding other regular user accounts can be found in `helpers/data.txt`.
