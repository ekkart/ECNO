1. Purpose
----------

This document explains how to launch the workflow engine with the provided
example business processes, and one scenario to work through this process.


2. Launching the workflow engine
--------------------------------

To start the workflow engine, on the file "loader.behaviourstates" in folder
examples; in the opened pop-up menu, choose "ECNO -> Start ECNO Engine".

After these steps, Worklist Viewer window should open, which you can use
to work through the process in different roles as explained in Sect. 4 --
by loging in an out in out for the different users. If you do not want to
log in and out as different users all the time, you can use the
"New Worklist Viewer" button on the top left of the Worklist Viewer, to
open additional Worklist Viewer where you can login as different users
at the same time (note that you cannot login as the same user in two
different Worklist Viewers).


3. Terminating the workflow engine
--------------------------------

To terminate the workflow engine, proceed as follows:

1. In the Eclipse workbench, choose "Window -> Show View -> Other..."; then, in
   the open "Show View" dialog, search for and select: ECNO: Engine Registry.
   
2. In the opened ECNO Engine Registry view, select the engine you had
   started earlier and click on the close button (icon "X").

If you want to save the state of the workflow engine at any time (e.g.
before terming it), you can press the save button (disk icon) after you
have selected the workflow engine in the ECNO: Engine Registry. In that case,
the next time you launch the workflow engine as described in Sect. 2, it
will start in exactly the situation in which you saved its state. Note
that you should not have any editors open on any of the workflow models
and configuration files in folder "example" when you save the state of
the workflow engine.

For more information on how to use the ECNO Engine, have a look into
the technical report on ECNO [2].


4. Running the Order process ("Example 2")
------------------------------------------

In general, the process models are a bit difficult to read in the EMF tree
editor. You will find user readable representations of the process models
in folder "example/diagrams" (as diagrams or text files). For a more
detailed discussion and explanation of these models, have a look at
Chapter 7 of the masters thesis of Jesper Jepsen [1].

To get started with "Example 2", try the following:

 1. Log in as Jack (Customer), using username="jack", password="pw".
 2. In another Worklist Viewer, log in as Ellen (Librarian),
    using "ellen" and "pw".
 3. In another Worklist Viewer, log in as Tom (Buyer), using "tom" and pw".
 4. As Jack, start a new Online Book Purchase Process.
 5. As Jack, open the activity Place New Book Order.
 6. As Jack, choose Find to select a pre-defined book
    (double click on a book to see the details).
 7. As Jack, choose the payment tab, and enter whatever you like --
    but not your real credit card information :-).
 8. As Jack, notice the Finish button has enabled.
 9. As Jack, you have done the work, so click on Finish.
10. As Ellen, notice you received a new task, Take Order, start it.
11. As Ellen, open Take Order, and create a new status document.
12. As Ellen, set the payment as "Accepted", set the availability to
    "Not In Stock" (DO NOT LEAVE THESE FIELDS EMPTY, THE PROCESS WILL
    GET STUCK).
13. As Ellen, Finish the task.
14. As Tom, start Back Order.
15. As Tom, set the availability field to "In Stock", and finish.
16. Now log in as Max (Shipping Agent) with username="max" and password="pw"
    (you can use the Worklist View of another user or you can create
    new one -- Sect. 2).
17. As Max, select the task "Ship" from the inbox, and then open the task.
18. In the open "Ship" task,  select the receipt tab and create a new receipt
    by pressing "New Document"
19. Add the required information to the receipt and then finish the task.
20. Now, in jack's worklist, the task "Check Receipt" should be available;
    start this task as Jack, and open it, and finish it (actually you could
    finish it even without opening it, since no new information is required).
21. Now, the case is finished (no tasks are available for any of the involved
    people, but jack could start a new case).

Remember that you can save the state of the workflow engine at any stage and
terminate it as discussed in Sect. 3, and later restart it in that state as
discussed in Sect. 2.


References
----------

[1] Jesper Jepsen: Realizing a Workflow Engine with the Event Coordination Notation --
    A Case-stydy Evaluating the Event Coordination Notation. MSc thesis, DTU Compute,
    September 2013, IMM-M.Sc.-2013-101.
    
[2] Ekkart Kindler: Coordinating Interactions: The Event Coordination Notation.
    Technical Report, DTU Compute, Spring 2014 (to appear).

