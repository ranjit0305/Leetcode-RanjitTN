select t.Sample_Id,
       t.Dna_Sequence,
       t.Species,
       case
          when t.Dna_Sequence like 'ATG%' then
           1
          else
           0
        end as Has_Start,
       
       case
          when t.Dna_Sequence like '%TAA' or t.Dna_Sequence like '%TAG' or t.Dna_Sequence like '%TGA' then
           1
          else
           0
        end as Has_Stop,
       
       case
          when t.Dna_Sequence like '%ATAT%' then
           1
          else
           0
        end as Has_Atat,
       
       case
          when t.Dna_Sequence like '%GGG%' then
           1
          else
           0
        end as Has_Ggg

  from Samples t

 order by t.Sample_Id asc