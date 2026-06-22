START

STEP 1: Initialize Scanner object and ArrayLists for:
        - Bus details   (busNames, busNumbers, capacities)
        - Route details (routeIds, sources, destinations, distances)
        - Passenger details (passengerNames, passengerPhones)
        - Booking details (bookingPassengers, bookingBuses, seatNumbers, journeyDates)
        - Schedule details (scheduleBus, departures, arrivals)

STEP 2: REPEAT
            Display Main Menu:
                1. Bus Management
                2. Route Management
                3. Schedule Management
                4. Passenger Management
                5. Ticket Booking
                6. Reports
                7. Exit
            Read 'choice'

            SWITCH(choice):
                CASE 1: CALL busManagement()
                CASE 2: CALL routeManagement()
                CASE 3: CALL scheduleManagement()
                CASE 4: CALL passengerManagement()
                CASE 5: CALL ticketBooking()
                CASE 6: CALL reports()
                CASE 7: Print "Thank You!"
                DEFAULT: Print "Invalid Choice!"
        UNTIL choice = 7

STEP 3: busManagement()
        Display sub-menu (Add / Update / Delete / View Bus)
        IF Add      -> read name, number, capacity; append to lists
        IF Update   -> view list, read index, update busNames at index
        IF Delete   -> view list, read index, remove element from all 3 lists
        IF View     -> print all bus records

STEP 4: routeManagement()
        Display sub-menu (Add / Update / Delete / View Route)
        IF Add  -> read routeId, source, destination, distance; append to lists
        IF View -> print all route records

STEP 5: scheduleManagement()
        Display sub-menu (Add / View Schedule)
        IF Add  -> read busName, departure, arrival; append to lists
        IF View -> print all schedule records

STEP 6: passengerManagement()
        Display sub-menu (Register / View Passenger)
        IF Register -> read name, phone; append to lists
        IF View     -> print all passenger records with generated ID

STEP 7: ticketBooking()
        Display sub-menu (Book / Cancel / Check Availability)
        IF Book          -> read passenger, bus, seat number, date; append to lists
        IF Cancel        -> view bookings, read index, remove from all 4 lists
        IF Check Avail.  -> print count of booked seats

STEP 8: reports()
        Print total buses, total routes, total bookings
        Compute totalSeats = SUM(capacities)
        Compute availableSeats = totalSeats - bookingPassengers.size()
        Print availableSeats

STEP 9: END (when choice = 7)
