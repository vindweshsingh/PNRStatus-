package pnrdto;

import java.io.Serializable;

public class PnrPassengerDto implements Serializable {
	
	
		private String user_pnr;
	 	private String dob;
	 	private String train_no;
	 	private String train_name;
	 	private String train_start_date;
	 	private String trn_source_stn;
	 	private String trn_desti_stn;
	    private String journey_to;
	    private String boarding_point;
	    private String reservation_upto;
	    private String journey_class;
	    private String ticket_number;
	    private String ticket_type;
	    private String booking_date;
	    private String booking_time;
	    private String totalcashfare;
	    private String oldcashfare;
	    private String transaction_id;
	    private String warnnet_no;
	    private String journey_end_date;
	    private String no_of_passenger;
	    private String location_code;
	    private String totalconfare;
	    private String lapmsgstn;
	    private String errorindex;
	    private String[] quota;
	    private String[] site_id;
	    private String[] ticket_lost;
	    private String[] distance;
	    private String[] chart_status;
	    private String[] counter_no;
	    private String[] refund_status;
	    private String[] error_message;
		/**
		 * 
		 */
		public PnrPassengerDto() {
		}
		
		/**
		 * @param user_pnr
		 * @param dob
		 * @param train_no
		 * @param train_name
		 * @param train_start_date
		 * @param trn_source_stn
		 * @param trn_desti_stn
		 * @param journey_to
		 * @param boarding_point
		 * @param reservation_upto
		 * @param journey_class
		 * @param ticket_number
		 * @param ticket_type
		 * @param booking_date
		 * @param booking_time
		 * @param totalcashfare
		 * @param oldcashfare
		 * @param transaction_id
		 * @param warnnet_no
		 * @param journey_end_date
		 * @param no_of_passenger
		 * @param location_code
		 * @param totalconfare
		 * @param lapmsgstn
		 * @param errorindex
		 * @param quota
		 * @param site_id
		 * @param ticket_lost
		 * @param distance
		 * @param chart_status
		 * @param counter_no
		 * @param refund_status
		 * @param error_message
		 */
		
		public PnrPassengerDto(String[] user_pnr, String[] dob, String[] train_no, String[] train_name,
				String[] train_start_date, String[] trn_source_stn, String[] trn_desti_stn, String[] journey_to,
				String[] boarding_point, String[] reservation_upto, String[] journey_class, String[] ticket_number,
				String[] ticket_type, String[] booking_date, String[] booking_time, String[] totalcashfare,
				String[] oldcashfare, String[] transaction_id, String[] warnnet_no, String[] journey_end_date,
				String[] no_of_passenger, String[] location_code, String[] totalconfare, String[] lapmsgstn,
				String[] errorindex, String[] quota, String[] site_id, String[] ticket_lost, String[] distance,
				String[] chart_status, String[] counter_no, String[] refund_status, String[] error_message) {
			this.user_pnr = user_pnr;
			this.dob = dob;
			this.train_no = train_no;
			this.train_name = train_name;
			this.train_start_date = train_start_date;
			this.trn_source_stn = trn_source_stn;
			this.trn_desti_stn = trn_desti_stn;
			this.journey_to = journey_to;
			this.boarding_point = boarding_point;
			this.reservation_upto = reservation_upto;
			this.journey_class = journey_class;
			this.ticket_number = ticket_number;
			this.ticket_type = ticket_type;
			this.booking_date = booking_date;
			this.booking_time = booking_time;
			this.totalcashfare = totalcashfare;
			this.oldcashfare = oldcashfare;
			this.transaction_id = transaction_id;
			this.warnnet_no = warnnet_no;
			this.journey_end_date = journey_end_date;
			this.no_of_passenger = no_of_passenger;
			this.location_code = location_code;
			this.totalconfare = totalconfare;
			this.lapmsgstn = lapmsgstn;
			this.errorindex = errorindex;
			this.quota = quota;
			this.site_id = site_id;
			this.ticket_lost = ticket_lost;
			this.distance = distance;
			this.chart_status = chart_status;
			this.counter_no = counter_no;
			this.refund_status = refund_status;
			this.error_message = error_message;
		}

		/**
		 * @return the user_pnr
		 */
		public String[] getUser_pnr() {
			return user_pnr;
		}

		/**
		 * @param user_pnr the user_pnr to set
		 */
		public void setUser_pnr(String[] user_pnr) {
			this.user_pnr = user_pnr;
		}

		/**
		 * @return the dob
		 */
		public String[] getDob() {
			return dob;
		}

		/**
		 * @param dob the dob to set
		 */
		public void setDob(String[] dob) {
			this.dob = dob;
		}

		/**
		 * @return the train_no
		 */
		public String[] getTrain_no() {
			return train_no;
		}

		/**
		 * @param train_no the train_no to set
		 */
		public void setTrain_no(String[] train_no) {
			this.train_no = train_no;
		}

		/**
		 * @return the train_name
		 */
		public String[] getTrain_name() {
			return train_name;
		}

		/**
		 * @param train_name the train_name to set
		 */
		public void setTrain_name(String[] train_name) {
			this.train_name = train_name;
		}

		/**
		 * @return the train_start_date
		 */
		public String[] getTrain_start_date() {
			return train_start_date;
		}

		/**
		 * @param train_start_date the train_start_date to set
		 */
		public void setTrain_start_date(String[] train_start_date) {
			this.train_start_date = train_start_date;
		}

		/**
		 * @return the trn_source_stn
		 */
		public String[] getTrn_source_stn() {
			return trn_source_stn;
		}

		/**
		 * @param trn_source_stn the trn_source_stn to set
		 */
		public void setTrn_source_stn(String[] trn_source_stn) {
			this.trn_source_stn = trn_source_stn;
		}

		/**
		 * @return the trn_desti_stn
		 */
		public String[] getTrn_desti_stn() {
			return trn_desti_stn;
		}

		/**
		 * @param trn_desti_stn the trn_desti_stn to set
		 */
		public void setTrn_desti_stn(String[] trn_desti_stn) {
			this.trn_desti_stn = trn_desti_stn;
		}

		/**
		 * @return the journey_to
		 */
		public String[] getJourney_to() {
			return journey_to;
		}

		/**
		 * @param journey_to the journey_to to set
		 */
		public void setJourney_to(String[] journey_to) {
			this.journey_to = journey_to;
		}

		/**
		 * @return the boarding_point
		 */
		public String[] getBoarding_point() {
			return boarding_point;
		}

		/**
		 * @param boarding_point the boarding_point to set
		 */
		public void setBoarding_point(String[] boarding_point) {
			this.boarding_point = boarding_point;
		}

		/**
		 * @return the reservation_upto
		 */
		public String[] getReservation_upto() {
			return reservation_upto;
		}

		/**
		 * @param reservation_upto the reservation_upto to set
		 */
		public void setReservation_upto(String[] reservation_upto) {
			this.reservation_upto = reservation_upto;
		}

		/**
		 * @return the journey_class
		 */
		public String[] getJourney_class() {
			return journey_class;
		}

		/**
		 * @param journey_class the journey_class to set
		 */
		public void setJourney_class(String[] journey_class) {
			this.journey_class = journey_class;
		}

		/**
		 * @return the ticket_number
		 */
		public String[] getTicket_number() {
			return ticket_number;
		}

		/**
		 * @param ticket_number the ticket_number to set
		 */
		public void setTicket_number(String[] ticket_number) {
			this.ticket_number = ticket_number;
		}

		/**
		 * @return the ticket_type
		 */
		public String[] getTicket_type() {
			return ticket_type;
		}

		/**
		 * @param ticket_type the ticket_type to set
		 */
		public void setTicket_type(String[] ticket_type) {
			this.ticket_type = ticket_type;
		}

		/**
		 * @return the booking_date
		 */
		public String[] getBooking_date() {
			return booking_date;
		}

		/**
		 * @param booking_date the booking_date to set
		 */
		public void setBooking_date(String[] booking_date) {
			this.booking_date = booking_date;
		}

		/**
		 * @return the booking_time
		 */
		public String[] getBooking_time() {
			return booking_time;
		}

		/**
		 * @param booking_time the booking_time to set
		 */
		public void setBooking_time(String[] booking_time) {
			this.booking_time = booking_time;
		}

		/**
		 * @return the totalcashfare
		 */
		public String[] getTotalcashfare() {
			return totalcashfare;
		}

		/**
		 * @param totalcashfare the totalcashfare to set
		 */
		public void setTotalcashfare(String[] totalcashfare) {
			this.totalcashfare = totalcashfare;
		}

		/**
		 * @return the oldcashfare
		 */
		public String[] getOldcashfare() {
			return oldcashfare;
		}

		/**
		 * @param oldcashfare the oldcashfare to set
		 */
		public void setOldcashfare(String[] oldcashfare) {
			this.oldcashfare = oldcashfare;
		}

		/**
		 * @return the transaction_id
		 */
		public String[] getTransaction_id() {
			return transaction_id;
		}

		/**
		 * @param transaction_id the transaction_id to set
		 */
		public void setTransaction_id(String[] transaction_id) {
			this.transaction_id = transaction_id;
		}

		/**
		 * @return the warnnet_no
		 */
		public String[] getWarnnet_no() {
			return warnnet_no;
		}

		/**
		 * @param warnnet_no the warnnet_no to set
		 */
		public void setWarnnet_no(String[] warnnet_no) {
			this.warnnet_no = warnnet_no;
		}

		/**
		 * @return the journey_end_date
		 */
		public String[] getJourney_end_date() {
			return journey_end_date;
		}

		/**
		 * @param journey_end_date the journey_end_date to set
		 */
		public void setJourney_end_date(String[] journey_end_date) {
			this.journey_end_date = journey_end_date;
		}

		/**
		 * @return the no_of_passenger
		 */
		public String[] getNo_of_passenger() {
			return no_of_passenger;
		}

		/**
		 * @param no_of_passenger the no_of_passenger to set
		 */
		public void setNo_of_passenger(String[] no_of_passenger) {
			this.no_of_passenger = no_of_passenger;
		}

		/**
		 * @return the location_code
		 */
		public String[] getLocation_code() {
			return location_code;
		}

		/**
		 * @param location_code the location_code to set
		 */
		public void setLocation_code(String[] location_code) {
			this.location_code = location_code;
		}

		/**
		 * @return the totalconfare
		 */
		public String[] getTotalconfare() {
			return totalconfare;
		}

		/**
		 * @param totalconfare the totalconfare to set
		 */
		public void setTotalconfare(String[] totalconfare) {
			this.totalconfare = totalconfare;
		}

		/**
		 * @return the lapmsgstn
		 */
		public String[] getLapmsgstn() {
			return lapmsgstn;
		}

		/**
		 * @param lapmsgstn the lapmsgstn to set
		 */
		public void setLapmsgstn(String[] lapmsgstn) {
			this.lapmsgstn = lapmsgstn;
		}

		/**
		 * @return the errorindex
		 */
		public String[] getErrorindex() {
			return errorindex;
		}

		/**
		 * @param errorindex the errorindex to set
		 */
		public void setErrorindex(String[] errorindex) {
			this.errorindex = errorindex;
		}

		/**
		 * @return the quota
		 */
		public String[] getQuota() {
			return quota;
		}

		/**
		 * @param quota the quota to set
		 */
		public void setQuota(String[] quota) {
			this.quota = quota;
		}

		/**
		 * @return the site_id
		 */
		public String[] getSite_id() {
			return site_id;
		}

		/**
		 * @param site_id the site_id to set
		 */
		public void setSite_id(String[] site_id) {
			this.site_id = site_id;
		}

		/**
		 * @return the ticket_lost
		 */
		public String[] getTicket_lost() {
			return ticket_lost;
		}

		/**
		 * @param ticket_lost the ticket_lost to set
		 */
		public void setTicket_lost(String[] ticket_lost) {
			this.ticket_lost = ticket_lost;
		}

		/**
		 * @return the distance
		 */
		public String[] getDistance() {
			return distance;
		}

		/**
		 * @param distance the distance to set
		 */
		public void setDistance(String[] distance) {
			this.distance = distance;
		}

		/**
		 * @return the chart_status
		 */
		public String[] getChart_status() {
			return chart_status;
		}

		/**
		 * @param chart_status the chart_status to set
		 */
		public void setChart_status(String[] chart_status) {
			this.chart_status = chart_status;
		}

		/**
		 * @return the counter_no
		 */
		public String[] getCounter_no() {
			return counter_no;
		}

		/**
		 * @param counter_no the counter_no to set
		 */
		public void setCounter_no(String[] counter_no) {
			this.counter_no = counter_no;
		}

		/**
		 * @return the refund_status
		 */
		public String[] getRefund_status() {
			return refund_status;
		}

		/**
		 * @param refund_status the refund_status to set
		 */
		public void setRefund_status(String[] refund_status) {
			this.refund_status = refund_status;
		}

		/**
		 * @return the error_message
		 */
		public String[] getError_message() {
			return error_message;
		}

		/**
		 * @param error_message the error_message to set
		 */
		public void setError_message(String[] error_message) {
			this.error_message = error_message;
		}
	    
	    
	    
	    
	  

}
