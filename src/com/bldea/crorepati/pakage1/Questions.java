package com.bldea.crorepati.pakage1;
import java.util.Scanner;
public class Questions {
	    static String result;
		static String result2;
		static int count_life_line = 3;
		static int aud_phn = 1;
		static int cnt_50_50 = 1;
		static int skip_cnt=1;
		static Scanner sc = new Scanner(System.in);

		public static boolean fetchQuestion1(String name) throws Exception {
			System.out.println("1. Who is the founder of Java?");
			System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
					+ "e) life line");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(1000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					}
				}

			}


			return false;
		}

		public static boolean fetchQuestion2(String name) throws Exception{
			System.out.println("2. Who is the captain of RCB?");
			System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"
					+ "e) help line");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(2000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("2")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(2000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(2000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(2000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(2000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(2000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(2000);
						return true;
					}
				}

			}
               return false;
		}
			public static boolean fetchQuestion3(String name) throws Exception {
				System.out.println("3.Who is the PM of India?");
				System.out.println("a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n"+"e)Life Line");
				result = sc.next();
				if(result.equalsIgnoreCase("b")) {
					Candidate.setAmount(5000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Danald trump\n" + "b) Narendra Modi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(10000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
													
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next("a) Danald trump\n" + "b) Narendra Modi\n");
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println();
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Danald trump\n" + "b) Narendra Modi\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(10000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a) Danald trump\n"+"b) Narendra Modi\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Danald trump\n"+"b) Narendra Modi\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a) Danald trump\n"+"b) Narendra Modi\n"+"c) Rahul Gandhi\n"+"d) Obama\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(10000);
							return true;
						}
					}

				}

			return false;
		}

			public static boolean fetchQuestion4(String name) throws Exception{
				System.out.println("4. who is the first Indian Woman to win the Ashoka Chakra?\"");
				System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n"+"e) Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(20000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(20000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(20000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d =0 %");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(20000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(20000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(20000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(20000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println("a) Neeraja Bhanot\n"+"b) Sudha Murthy\n"+"c)Shindu \n"+"d) Bachendripal\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(20000);
							return true;
						}
					}

				}
	               return false;
			}
			public static boolean fetchQuestion5(String name) throws Exception {
				System.out.println("5.Which element is made up of diamond?");
				System.out.println("a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(40000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)oxygen\n"+"b)Carbon\n");		
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(40000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(40000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)oxygen\n"+"b)Carbon\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)oxygen\n"+"b)Carbon\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(40000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(40000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(40000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)oxygen\n"+"b)Carbon\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)oxygen\n"+"b)Carbon\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(40000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)oxygen\n"+"b)Carbon\n"+"c)Nitrogen \n"+"d)Hydrogen\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(40000);
							return true;
						}
					}

				}


				return false;
			}
			public static boolean fetchQuestion6(String name) throws Exception {
				System.out.println("6.Which element is laughing gas ?");
				System.out.println("a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(60000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 4%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(60000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Carbon\n"+"c)Nitrous oxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(60000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("d")) {
													Candidate.setAmount(1000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Carbon\n"+"c)Nitrous oxide\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(60000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 4%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(60000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(60000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 4%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 4%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("b)Carbon\n"+"c)Nitrous oxide\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Carbon\n"+"c)Nitrous oxide\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 4%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("d")) {
													Candidate.setAmount(1000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(60000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)oxygen\n"+"b)Carbon\n"+"c)Nitrous oxide\n"+"d)Hydrogen\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(60000);
							return true;
						}
					}

				}


				return false;
			}
			public static boolean fetchQuestion7(String name) throws Exception {
				System.out.println("7.What does the ozone layer protect from us?");
				System.out.println("a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(100000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)UV rays\n"+"b)x-rays\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(100000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(100000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)UV rays\n"+"b)x-rays\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)UV rays\n"+"b)x-rays\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(100000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(100000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(100000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 8%\n" + "option c = 5%\n" + "option d =0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)UV rays\n"+"b)x-rays\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)UV rays\n"+"b)x-rays\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 7%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(100000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)UV rays\n"+"b)x-rays\n"+"c)Nitrogen\n"+"d)Hydrogen\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(100000);
							return true;
						}
					}

				}


				return false;
			}
			public static boolean fetchQuestion8(String name) throws Exception {
				System.out.println("8.When is the National Farmer's day?");
				System.out.println("a)March\n"+"b)December\n"+"c)April \n"+"d)May\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					Candidate.setAmount(1200000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)March\n"+"b)December\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(1200000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1200000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)March\n"+"b)December\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)March\n"+"b)December\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1200000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(1200000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1200000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n"+"e)Life Line");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1200000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)March\n"+"b)December\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)March\n"+"b)December\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1200000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 7%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("d")) {
													Candidate.setAmount(1200000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1200000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)March\n"+"b)December\n"+"c)April \n"+"d)May\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(1200000);
							return true;
						}
					}

				}


				return false;
			}
			public static boolean fetchQuestion9(String name) throws Exception {
				System.out.println("9.When is the National Girl Child Day celebrated in India?");
				System.out.println("a)March\n"+"b)December\n"+"c)January \n"+"d)May\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(1600000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 88%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1600000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)December\n"+"c)January \n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(1600000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1600000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("b)December\n"+"c)January \n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)December\n"+"c)January \n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(1600000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 88%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(1600000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1600000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 88%\n" + "option d = 5%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1600000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 88%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("b)December\n"+"c)January \n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)December\n"+"c)January \n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(1600000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 0%\n" + "option b = 7%\n" + "option c = 88%\n" + "option d = 5%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1600000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)March\n"+"b)December\n"+"c)January \n"+"d)May\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(1600000);
							return true;
						}
					}

				}


				return false;
			}
			public static boolean fetchQuestion10(String name) throws Exception {
				System.out.println("10.When were the Commonwealth Games first held?");
				System.out.println("a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n"+"e)Life Line");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(10000000);
					return true;
				} else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)1930\n"+"b)1830\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(10000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)1930\n"+"b)1830\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)1930\n"+"b)1830\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(10000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a)1930\n"+"b)1830\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)1930\n"+"b)1830\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result3.equalsIgnoreCase("b")) {
											if (aud_phn != 0) {
												aud_phn = 0;
												Thread.sleep(10000);
												System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 0%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println(
														"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println(
								"a)1930\n"+"b)1830\n"+"c)1990 \n"+"d)1960\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(10000000);
							return true;
						}
					}

				}


				return false;
			}




}

	//tinyurl.com/questions-class
